package com.michaldebicki;

public class DwarfPlanet extends HeavenlyBody {
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, Bodytypes.DWARF_PLANET);
    }
}
