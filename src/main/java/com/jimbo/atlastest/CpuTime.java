package com.jimbo.atlastest;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class CpuTime {

    /** Get CPU time in ms. */
    public static long getCpuTime( ) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean( );
        return bean.isCurrentThreadCpuTimeSupported( ) ?
            bean.getCurrentThreadCpuTime() / 1000000 : 0L;
    }

    /** Get user time in ms. */
    private static long getUserTime( ) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean( );
        return bean.isCurrentThreadCpuTimeSupported( ) ?
            bean.getCurrentThreadUserTime( ) / 1000000 : 0L;
    }

    /** Get system time in nanoseconds. */
    private static long getSystemTime( ) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean( );
        return bean.isCurrentThreadCpuTimeSupported( ) ?
            (bean.getCurrentThreadCpuTime( ) - bean.getCurrentThreadUserTime( )) : 0L;
    }

}