package geo.geoSystem.service;

import geo.geoSystem.data.dto.LocaDTO;
import geo.geoSystem.data.entity.Loca;

import java.util.List;

public interface LocaService {
    LocaDTO saveLoca(LocaDTO locaDTO);

    List<LocaDTO> getLocaList();
}
