package co.edu.umanizales.tads.controller;

import co.edu.umanizales.tads.controller.dto.ResponseDTO;
import co.edu.umanizales.tads.servicie.ListSEService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "/listse")
public class ListSEController {
    private ListSEService listSEService;

    public ResponseEntity<ResponseDTO>getKids(){
        return new ResponseEntity<>(new ResponseDTO(200,listSEService.getKids(),null),
                HttpStatus.OK);
    }

}
