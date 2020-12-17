package com.cmc.util;

import java.sql.Timestamp;

public class Conversiones {

	// Conversión de String a Timestamp
	public static Timestamp toTimestamp(String fecha) {

		// Timestamp format must be yyyy-mm-dd hh:mm:ss[.fffffffff]
		Boolean format = fecha.matches(
				"20[0-9]{2}-(0[1-9]{1}||(1[0-2]{1}))-(0[1-9]{1}||(1[1-9]{1})||(2[1-9]{1})||(3[0-1]{1})) [0-9]{2}:[0-9]{2}:[0-9]{2}(.[0-9])*");

		if ((fecha == null) || (!format)) {
			return null;
		}
		return Timestamp.valueOf(fecha);
	}

	// Conversión de String a Float
	public static Float toFloat(String valor) {

		// Float (+||-)ffff*.ffff*
		Boolean format = valor.matches("(\\+||-)[0-9]+\\.[0-9]*");

		if ((valor == null) || (!format)) {
			return null;
		}
		return Float.parseFloat(valor);

	}
}
