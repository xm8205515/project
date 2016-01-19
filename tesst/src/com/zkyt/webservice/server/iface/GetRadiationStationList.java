package com.zkyt.webservice.server.iface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getRadiationStationList complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="getRadiationStationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRadiationStationList", propOrder = { "name", "cityCode",
		"areaCode", "baseNum" })
public class GetRadiationStationList {

	protected String name;
	protected String cityCode;
	protected String areaCode;
	protected String baseNum;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the cityCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * Sets the value of the cityCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCityCode(String value) {
		this.cityCode = value;
	}

	/**
	 * Gets the value of the areaCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * Sets the value of the areaCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAreaCode(String value) {
		this.areaCode = value;
	}

	/**
	 * Gets the value of the baseNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBaseNum() {
		return baseNum;
	}

	/**
	 * Sets the value of the baseNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBaseNum(String value) {
		this.baseNum = value;
	}

}
