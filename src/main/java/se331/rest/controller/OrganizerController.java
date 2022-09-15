package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import se331.rest.entity.Organizer;
import se331.rest.service.OrganizerService;

@Controller
public class OrganizerController {
    @Autowired
    OrganizerService organizerService;
    @PostMapping("/organizer")
    public ResponseEntity<?> addOrganizer(@RequestBody Organizer organizer) {
        Organizer output = organizerService.save(organizer);
        return ResponseEntity.ok(organizer);
    }
}
