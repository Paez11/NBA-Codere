package Modelo;

import interfaces.IDinero;

import java.io.File;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Dinero")
@XmlAccessorType(XmlAccessType.FIELD)
public class Dinero implements IDinero, Serializable {

	private static final long serialVersionUID = 1L;
	private int puntos;
	
	public Dinero() {
		this.puntos = 0;
	}
	
	public Dinero(int puntos) {
		this.puntos = puntos;
	}
	
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		if (puntos >= 0) {
			this.puntos = puntos;
		}
	}

	public void acumularPuntos(int puntos) {
		if (puntos < 0) {
			if ((this.puntos+puntos) >= 0) {
				this.puntos = this.puntos + puntos;
			}
			else {
				this.puntos = 0;
			}
		}
		else {
			this.puntos = this.puntos + puntos;
		}
	}
	
	public void saveFile(String url) {
		JAXBContext contexto;
		Dinero aux = new Dinero(this.puntos);
		try {
			contexto = JAXBContext.newInstance(Dinero.class);
			Marshaller m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(aux, new File(url));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public void loadFile(String url) {
		JAXBContext contexto;
		try {
			contexto = JAXBContext.newInstance(Dinero.class);
			Unmarshaller um=contexto.createUnmarshaller();
			Dinero dinero=(Dinero)um.unmarshal(new File(url));
			this.puntos=dinero.puntos;
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
