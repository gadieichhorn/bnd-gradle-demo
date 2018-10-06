package com.rds.demo.bnd.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Dispatcher {

    void dispatch(Command command);
}
