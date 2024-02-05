package geo.geoSystem.data.dao;

import geo.geoSystem.data.entity.Loca;

import java.util.List;

public interface LocaDAO {
    Loca saveLoca(Loca loca);

    List<Loca> getAllLocas();
}
