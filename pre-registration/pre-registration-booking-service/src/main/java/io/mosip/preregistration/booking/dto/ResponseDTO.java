/* 
 * Copyright
 * 
 */
package io.mosip.preregistration.booking.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This DTO class is used to accept the response values.
 * 
 * @author Rajath KR
 * @since 1.0.0
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class ResponseDTO<T> implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6705845720255847210L;

	/** The error details. */
	private ExceptionJSONInfoDTO err;

	/**
	 * Response Status
	 */
	private String status;

	/**
	 * Response Date Time
	 */
	private String resTime;

	/**
	 * List of Response
	 */
	private List<T> response;

}
