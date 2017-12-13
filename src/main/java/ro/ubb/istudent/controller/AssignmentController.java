package ro.ubb.istudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ubb.istudent.service.AssignmentService;

/**
 * Created by Cristina on 12/13/2017.
 */

@RestController
public class AssignmentController {
    @Autowired
    private AssignmentService assignmentService;

    @RequestMapping(value = "/statistics", method = RequestMethod.GET)
    public String getNrAssignWithFeedbackFromStudent(){
        return String.valueOf(this.assignmentService.getNrAssignWithFeedbackFromStudent());
    }
}
