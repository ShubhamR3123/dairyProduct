package com.shubhamit.dairy.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {

public ResourceNotFoundException(String dairy){

    super(dairy);
}
}
