package geo.geoSystem.service.impl;

import geo.geoSystem.data.dao.LocaDAO;
import geo.geoSystem.data.dto.LocaDTO;
import geo.geoSystem.data.entity.Loca;
import geo.geoSystem.service.LocaService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class LocaServiceImple implements LocaService {
    private final LocaDAO locaDAO;


    @Override
    public LocaDTO saveLoca(LocaDTO locaDTO) {
        Loca loca = new Loca();
        loca.setX(locaDTO.getX());
        loca.setY(locaDTO.getY());
        locaDAO.saveLoca(loca);

        return locaDTO;
    }

    @Override
    public List<LocaDTO> getLocaList() {
        List<Loca> locaList = locaDAO.getAllLocas();
        List<LocaDTO> locaDTOList = new ArrayList<>();
        for(Loca loca : locaList){
            LocaDTO locaDTO = new LocaDTO(loca.getX(), loca.getY());
            locaDTOList.add(locaDTO);
        }

        return locaDTOList;
    }
}
