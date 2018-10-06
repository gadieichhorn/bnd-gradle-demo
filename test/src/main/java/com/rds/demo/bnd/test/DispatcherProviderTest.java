package com.rds.demo.bnd.test;

import com.rds.demo.bnd.api.Dispatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

public class DispatcherProviderTest {

    private final BundleContext context = FrameworkUtil.getBundle(DispatcherProviderTest.class).getBundleContext();

    private ServiceTracker<Dispatcher, Dispatcher> dispatcherServiceTracker;

    @Before
    public void before() {
        dispatcherServiceTracker = new ServiceTracker(context, Dispatcher.class, null);
        dispatcherServiceTracker.open(true);
    }

    @After
    public void after() {
        dispatcherServiceTracker.close();
    }

    @Test
    public void testInit() throws Exception {
//        DummyVerticle dummy = verticleTracker.waitForService(1000);
//        assertNotNull("Dummy Verticle service not found", dummy);
//        assertTrue("Init", dummy.isInit());
    }

}
