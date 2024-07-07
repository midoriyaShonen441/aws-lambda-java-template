package com.natta;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.natta.dto.RequestDTO;

public class LambdaHandler implements RequestHandler<RequestDTO, String> {

    @Override
    public String handleRequest(RequestDTO event, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("String found: " + event.getFullName());
        return "Hello " + event.getFullName();
    }
}