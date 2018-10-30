
package ictcs210.tute1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorldWS", targetNamespace = "http://tute1.ictcs210/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorldWS {


    /**
     * 
     * @param celsius
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CelsiusToFahrenheit")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CelsiusToFahrenheit", targetNamespace = "http://tute1.ictcs210/", className = "ictcs210.tute1.CelsiusToFahrenheit")
    @ResponseWrapper(localName = "CelsiusToFahrenheitResponse", targetNamespace = "http://tute1.ictcs210/", className = "ictcs210.tute1.CelsiusToFahrenheitResponse")
    @Action(input = "http://tute1.ictcs210/HelloWorldWS/CelsiusToFahrenheitRequest", output = "http://tute1.ictcs210/HelloWorldWS/CelsiusToFahrenheitResponse")
    public String celsiusToFahrenheit(
        @WebParam(name = "Celsius", targetNamespace = "")
        double celsius);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://tute1.ictcs210/", className = "ictcs210.tute1.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://tute1.ictcs210/", className = "ictcs210.tute1.HelloResponse")
    @Action(input = "http://tute1.ictcs210/HelloWorldWS/helloRequest", output = "http://tute1.ictcs210/HelloWorldWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param number
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "squareMethod", targetNamespace = "http://tute1.ictcs210/", className = "ictcs210.tute1.SquareMethod")
    @ResponseWrapper(localName = "squareMethodResponse", targetNamespace = "http://tute1.ictcs210/", className = "ictcs210.tute1.SquareMethodResponse")
    @Action(input = "http://tute1.ictcs210/HelloWorldWS/squareMethodRequest", output = "http://tute1.ictcs210/HelloWorldWS/squareMethodResponse")
    public String squareMethod(
        @WebParam(name = "number", targetNamespace = "")
        int number);

    /**
     * 
     * @param cm
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConvertercmToInch")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConvertercmToInch", targetNamespace = "http://tute1.ictcs210/", className = "ictcs210.tute1.ConvertercmToInch")
    @ResponseWrapper(localName = "ConvertercmToInchResponse", targetNamespace = "http://tute1.ictcs210/", className = "ictcs210.tute1.ConvertercmToInchResponse")
    @Action(input = "http://tute1.ictcs210/HelloWorldWS/ConvertercmToInchRequest", output = "http://tute1.ictcs210/HelloWorldWS/ConvertercmToInchResponse")
    public String convertercmToInch(
        @WebParam(name = "cm", targetNamespace = "")
        double cm);

}
