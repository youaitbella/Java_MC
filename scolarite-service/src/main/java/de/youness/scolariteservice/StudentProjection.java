package de.youness.scolariteservice;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="p1", types=Student.class)
public interface StudentProjection {
	public String getEmail();
	public String getName();
}
