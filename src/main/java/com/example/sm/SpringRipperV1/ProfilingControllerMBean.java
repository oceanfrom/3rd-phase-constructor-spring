package com.example.sm.SpringRipperV1;


import javax.management.MXBean;

@MXBean
public interface ProfilingControllerMBean {
    void setEnabled(boolean enabled);
}
