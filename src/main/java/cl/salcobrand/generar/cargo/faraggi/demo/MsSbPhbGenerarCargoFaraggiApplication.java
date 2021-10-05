package cl.salcobrand.generar.cargo.faraggi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tempuri.CargoVenta;
import org.tempuri.CargoVentaResponse;

@SpringBootApplication
@RestController
public class MsSbPhbGenerarCargoFaraggiApplication {
	
	@GetMapping(value ="/obtenerCargo")
	public CargoVentaResponse obtenerCargo() {
		
		/*
		 * String soapenvelope = "http://schemas.xmlsoap.org/soap/envelope/"; 
		 * String tempuriorg = "http://tempuri.org/";
		 */
		String version = "1.0";
		String encoding = "ISO-8859-1";
		
		String url = "https://apisgw.sb.cl/phb/externos/faraggi/cargo.wsdl?wsdl";		
		String xmlrequest = "<?xml version=\""+version+"\" encoding=\""+encoding+"\"?><CargoVenta><CodigoDeVenta>561768008</CodigoDeVenta><Estado>0</Estado><CiaSeguros>10</CiaSeguros><Poliza>2071817</Poliza><CodigoUnico>2505760</CodigoUnico><FechaVenta>2020-04-02</FechaVenta><Local>380</Local><Caja>2</Caja><Boleta>435307732</Boleta><RutTitular>8626052</RutTitular><CorrelativoDeCarga>0</CorrelativoDeCarga><RutBeneficiario>8626052</RutBeneficiario><RutMedico>7678515</RutMedico><NombreMedico>MARIANELLA OBERREUTER LAVIN</NombreMedico><NroProductosBoleta>3</NroProductosBoleta><DetalleVenta><CodigoProducto>434721</CodigoProducto><NombreProducto>ZOPINOM 3mg COMP.X30</NombreProducto><TipoProducto>M</TipoProducto><UnidadesVendidas>1</UnidadesVendidas><PrecioUnitario>5631</PrecioUnitario><MontoBonificado>4505</MontoBonificado><MontoDeducible>0</MontoDeducible><MontoCopago>1126</MontoCopago></DetalleVenta><DetalleVenta><CodigoProducto>434721</CodigoProducto><NombreProducto>ZOPINOM 3mg COMP.X30</NombreProducto><TipoProducto>M</TipoProducto><UnidadesVendidas>1</UnidadesVendidas><PrecioUnitario>1126</PrecioUnitario><MontoBonificado>901</MontoBonificado><MontoDeducible>0</MontoDeducible><MontoCopago>225</MontoCopago></DetalleVenta><DetalleVenta><CodigoProducto>430254</CodigoProducto><NombreProducto>(B) CLONAZEPAM 2mg COMP.X30</NombreProducto><TipoProducto>G</TipoProducto><UnidadesVendidas>1</UnidadesVendidas><PrecioUnitario>4591</PrecioUnitario><MontoBonificado>4591</MontoBonificado><MontoDeducible>0</MontoDeducible><MontoCopago>0</MontoCopago></DetalleVenta></CargoVenta>";
		  
		  CargoVenta cargoventa = new CargoVenta(); 
		  cargoventa.setXMLINPUT(xmlrequest);
		  		  
		  Configuration configuration = new Configuration(); 
		  CargoVentaResponse responsesoapconnector = (CargoVentaResponse) configuration.soapconnector(configuration.marshaller()).callWebService(url, cargoventa);
		 	
		return responsesoapconnector;	
	}	

	public static void main(String[] args) {
		SpringApplication.run(MsSbPhbGenerarCargoFaraggiApplication.class, args);
	}

}
