package com.feiniaojin.boot.log4j2;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;
import org.apache.logging.log4j.core.pattern.PatternConverter;

/**
 * 解决traceId为空时的占位问题
 */
@Plugin(name = "TraceIdConverter", category = PatternConverter.CATEGORY)
@ConverterKeys({"traceId"})
public class DefaultTraceIdLogEventPatternConverter extends LogEventPatternConverter {

    private static final String s = "N/A";

    private static final DefaultTraceIdLogEventPatternConverter INSTANCE =
            new DefaultTraceIdLogEventPatternConverter("traceId", "traceId");

    public static DefaultTraceIdLogEventPatternConverter newInstance() {
        return INSTANCE;
    }

    protected DefaultTraceIdLogEventPatternConverter(String name, String style) {
        super(name, style);
    }

    @Override
    public void format(LogEvent event, StringBuilder toAppendTo) {
        // 获取当前线程的MDC中的traceId值
        Object traceId = event.getContextData().getValue("traceId");
        if (traceId == null) {
            toAppendTo.append(s);
        } else {
            toAppendTo.append(traceId);
        }
    }
}
