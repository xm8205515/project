package com.zkyt.webservice.server.iface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.zkyt.webservice.server.iface package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _GetRadiationStationList_QNAME = new QName(
			"http://iface.server.webservice.zkyt.com",
			"getRadiationStationList");
	private final static QName _GetRadiationStationListResponse_QNAME = new QName(
			"http://iface.server.webservice.zkyt.com",
			"getRadiationStationListResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.zkyt.webservice.server.iface
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link GetRadiationStationListResponse }
	 * 
	 */
	public GetRadiationStationListResponse createGetRadiationStationListResponse() {
		return new GetRadiationStationListResponse();
	}

	/**
	 * Create an instance of {@link GetRadiationStationList }
	 * 
	 */
	public GetRadiationStationList createGetRadiationStationList() {
		return new GetRadiationStationList();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetRadiationStationList }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://iface.server.webservice.zkyt.com", name = "getRadiationStationList")
	public JAXBElement<GetRadiationStationList> createGetRadiationStationList(
			GetRadiationStationList value) {
		return new JAXBElement<GetRadiationStationList>(
				_GetRadiationStationList_QNAME, GetRadiationStationList.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetRadiationStationListResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://iface.server.webservice.zkyt.com", name = "getRadiationStationListResponse")
	public JAXBElement<GetRadiationStationListResponse> createGetRadiationStationListResponse(
			GetRadiationStationListResponse value) {
		return new JAXBElement<GetRadiationStationListResponse>(
				_GetRadiationStationListResponse_QNAME,
				GetRadiationStationListResponse.class, null, value);
	}

}
