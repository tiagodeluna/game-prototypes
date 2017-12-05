package com.dragonhunters.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragonhunters.infrastructure.EquipmentRepository;
import com.dragonhunters.model.card.equipment.EquipmentCard;
import com.dragonhunters.model.gameplay.GameSetup;
import com.dragonhunters.util.RandomnessUtil;

@Service
public class EquipmentSelectorService implements SelectorService<GameSetup> {

	private EquipmentRepository equipmentRepository;
	
	@Autowired
	public EquipmentSelectorService(EquipmentRepository equipmentRepository) {
		this.equipmentRepository = equipmentRepository;
	}

	@Override
	public void select(GameSetup game) {
		//Find the initial equipment
		List<EquipmentCard> equipments = this.equipmentRepository.findBySelector(true);
		//Get player's initial equipment
		game.getPlayerCharacter().getEquipments().add(
				(EquipmentCard) RandomnessUtil.drawCard(equipments));
		
		//Recover all available cards and place it into the game setup
		equipments.addAll(this.equipmentRepository.findBySelector(false));
		game.setEquipments(equipments);
	}

}
