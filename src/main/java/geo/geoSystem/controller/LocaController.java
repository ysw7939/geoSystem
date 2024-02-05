package geo.geoSystem.controller;

import geo.geoSystem.data.dao.LocaDAO;
import geo.geoSystem.data.dao.impl.LocaDAOImpl;
import geo.geoSystem.data.dto.LocaDTO;
import geo.geoSystem.data.entity.Loca;
import geo.geoSystem.service.LocaService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/loca-api")
@RequiredArgsConstructor
public class LocaController {
    private final LocaService locaService;
    private final Logger LOGGER = LoggerFactory.getLogger(LocaController.class);

    @PostMapping("/loca")
    public ResponseEntity<LocaDTO> addLoca(@RequestBody LocaDTO locaDTO){
        LOGGER.info("[addLoca] perform {} of Around Hub API.", "addLoca");
        LocaDTO loca = locaService.saveLoca(locaDTO);
        return ResponseEntity.status(HttpStatus.OK).body(loca);
    }

    @GetMapping("/allLocas")
    public List<LocaDTO>  allLocas() {
        return   locaService.getLocaList();
    }
}
