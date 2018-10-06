package com.rds.demo.bnd.test;

import com.rds.demo.bnd.api.Command;
import com.rds.demo.bnd.api.Dispatcher;
import org.osgi.service.component.annotations.Component;

@Component
public class DispatcherProviderTest implements Dispatcher {

    @Override
    public void dispatch(Command command) {

    }
}
