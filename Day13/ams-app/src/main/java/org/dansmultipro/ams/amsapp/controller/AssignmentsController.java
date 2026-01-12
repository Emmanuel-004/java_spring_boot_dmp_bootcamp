package org.dansmultipro.ams.amsapp.controller;

import org.dansmultipro.ams.amsapp.dto.UpdateResponseDto;
import org.dansmultipro.ams.amsapp.dto.assignment.AddAssignmentRequestDto;
import org.dansmultipro.ams.amsapp.dto.assignment.AddAssignmentResponseDto;
import org.dansmultipro.ams.amsapp.dto.assignment.AssignmentDetailResponseDto;
import org.dansmultipro.ams.amsapp.dto.assignment.AssignmentResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/assignments")
public class AssignmentsController {

    @GetMapping
    public List<AssignmentResponseDto> getAssignments() {
        return null;
    }

    @GetMapping("/{id}")
    public List<AssignmentDetailResponseDto> getAssignmentsById(@PathVariable String id) {
        return null;
    }

    @PostMapping("/assign")
    public AddAssignmentResponseDto assignAssignments(@RequestBody AddAssignmentRequestDto request) {
        return null;
    }

    @PatchMapping("/{id}")
    public UpdateResponseDto returnAssignments(@PathVariable String id, @RequestBody List<String> detailsId) {
        return null;
    }
}
