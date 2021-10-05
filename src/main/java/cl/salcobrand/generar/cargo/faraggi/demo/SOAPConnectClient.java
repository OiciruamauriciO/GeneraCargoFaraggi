package cl.salcobrand.generar.cargo.faraggi.demo;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;
import org.tempuri.CargoVenta;
import org.tempuri.CargoVentaResponse;

public class SOAPConnectClient extends WebServiceGatewaySupport {
	/**
	 * @param url
	 * @param request
	 * @return Object
	 */
	public CargoVentaResponse callWebService(String url, Object request) {
		
		CargoVentaResponse cargoventaresponse = (CargoVentaResponse) getWebServiceTemplate().marshalSendAndReceive(url, (CargoVenta)request, new WebServiceMessageCallback() {
		
			@Override
			public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
				((SoapMessage)message).setSoapAction("http://tempuri.org/CargoVenta");
				System.out.println(message);				
			}
		});
		
		return cargoventaresponse;
	}
}
