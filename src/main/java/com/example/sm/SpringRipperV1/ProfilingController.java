package com.example.sm.SpringRipperV1;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ProfilingController implements ProfilingControllerMBean {
    private boolean enabled = true;

}