package com.task.odapi.controller;

import com.task.odapi.model.*;
import com.task.odapi.service.ODAPIServiceImpl;
import com.task.odapi.util.OD_API_CONSTANTS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ODAPIControllerImpl {

    @Autowired
    ODAPIServiceImpl odapiService;

    private static final Logger log = LoggerFactory.getLogger(OD_API_CONSTANTS.LOG_MODULE_NAME.getValue());

    @RequestMapping(method = RequestMethod.GET, produces = "application/json; charset=UTF-8", value="/response")
    @ResponseBody
    public Map<String, Response> getODAPIResponseController() {
        return odapiService.getODAPIResponseService();
    }

}
