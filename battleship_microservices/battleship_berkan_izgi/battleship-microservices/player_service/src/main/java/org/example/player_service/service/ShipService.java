package org.example.player_service.service;

import org.example.player_service.repository.ShipRepository;
import org.springframework.stereotype.Service;
import org.example.player_service.model.Ship;

import java.util.List;

@Service
public class ShipService {
    private final ShipRepository shipRepository;

    public ShipService(ShipRepository shipRepository){
        this.shipRepository = shipRepository;
    }

    public List<Ship> getShipsByPlayerId(Long playerId){
        return shipRepository.findByPlayerId(playerId);
    }

    public Ship placeShip(Long playerId, int x, int y, int length, boolean isHorizontal){
        Ship ship = new Ship(x,y,length,isHorizontal);
        return shipRepository.save(ship);
    }



}
