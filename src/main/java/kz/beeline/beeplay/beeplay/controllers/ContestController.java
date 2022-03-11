package kz.beeline.beeplay.beeplay.controllers;

import kz.beeline.beeplay.beeplay.entity.dto.ContestDTO;
import kz.beeline.beeplay.beeplay.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
//@Api(value = "Contest Resources",description = "Crud Operations")
public class ContestController {
    @Autowired
    private final ContestService contestService;

    public ContestController(ContestService contestService) {
        this.contestService = contestService;
    }

    @GetMapping("/contests")
//    @ApiOperation(value = "Get all contests with pages",response = Iterable.class)
    public ResponseEntity<?> getAllContests(@RequestParam(name = "page_size", required = false, defaultValue = "10") Integer size,
                                            @RequestParam(name = "page", required = false, defaultValue = "0") Integer page) {
        return ResponseEntity.ok(contestService.getContestPage(page, size).getContent());
    }

    @GetMapping("/contests/{slug}")
//    @ApiOperation(value = "Get contest with slug",response = ContestDTO.class)
    public ResponseEntity<?> getContestBySlug(@PathVariable("slug") String slug) {

        ContestDTO contestDTO;
        try {
            contestDTO = contestService.getContestBySlug(slug);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Contest doesn't exist");
        }
        return ResponseEntity.ok(contestDTO);
    }




}