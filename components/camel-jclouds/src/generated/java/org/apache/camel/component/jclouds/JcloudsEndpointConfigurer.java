/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jclouds;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JcloudsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JcloudsEndpoint target = (JcloudsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "blobname":
        case "blobName": target.getConfiguration().setBlobName(property(camelContext, java.lang.String.class, value)); return true;
        case "container": target.getConfiguration().setContainer(property(camelContext, java.lang.String.class, value)); return true;
        case "directory": target.getConfiguration().setDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "group": target.getConfiguration().setGroup(property(camelContext, java.lang.String.class, value)); return true;
        case "hardwareid":
        case "hardwareId": target.getConfiguration().setHardwareId(property(camelContext, java.lang.String.class, value)); return true;
        case "imageid":
        case "imageId": target.getConfiguration().setImageId(property(camelContext, java.lang.String.class, value)); return true;
        case "locationid":
        case "locationId": target.getConfiguration().setLocationId(property(camelContext, java.lang.String.class, value)); return true;
        case "nodeid":
        case "nodeId": target.getConfiguration().setNodeId(property(camelContext, java.lang.String.class, value)); return true;
        case "nodestate":
        case "nodeState": target.getConfiguration().setNodeState(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "user": target.getConfiguration().setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}
