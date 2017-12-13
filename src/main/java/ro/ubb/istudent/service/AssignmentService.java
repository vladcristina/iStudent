package ro.ubb.istudent.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import ro.ubb.istudent.repository.AssignmentRepository;

/**
 * Created by Cristina on 12/13/2017.
 */

@Service
@Transactional
public class AssignmentService {
    private static final Logger LOG = LoggerFactory.getLogger(GreetingService.class);
    @Autowired
    private AssignmentRepository repository;

//    public AssignmentService(AssignmentRepository repository) {
//        this.repository = repository;
//    }

    public long getNrAssignWithFeedbackFromStudent(){
        return this.repository.findAll().stream().filter(
            assignmentEntity -> !ObjectUtils.isEmpty(assignmentEntity.getFeedbackEntity().getStudentEntity()))
                .count();
    }

}
