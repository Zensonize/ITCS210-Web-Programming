/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ictcs210.tute1;

import java.text.DecimalFormat;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author krittametkiattikulwattana
 */
@WebService(serviceName = "HelloWorldWS")
public class HelloWorldWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "squareMethod")
    public String squareMethod(@WebParam(name = "number") final int number) {
        //TODO write your implementation code here:
        int result = number*number;
        String strResult = Integer.toString(result);
        return strResult;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConvertercmToInch")
    public String ConvertercmToInch(@WebParam(name = "cm") final double cm) {
        DecimalFormat df = new DecimalFormat("#.00"); 
        double answer = cm * 0.393701;
        return df.format(answer);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CelsiusToFahrenheit")
    public String CelsiusToFahrenheit(@WebParam(name = "Celsius") final double Celsius) {
        //TODO write your implementation code here:
        DecimalFormat df = new DecimalFormat("#.00"); 
        double answer = (Celsius*9/5) + 32;
        return df.format(answer);
    }
}
