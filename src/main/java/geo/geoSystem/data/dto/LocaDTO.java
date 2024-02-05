package geo.geoSystem.data.dto;

import lombok.Data;

@Data
public class LocaDTO {
    private double x;
    private double y;

    public LocaDTO(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public LocaDTO() {
    }
}
