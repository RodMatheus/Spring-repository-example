package com.example.demo.dominio;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.With;

@Builder
@With
@ApiModel
@Getter
@Setter
public class ExampleDTO {
	
	@ApiModelProperty
	private String name;
}
