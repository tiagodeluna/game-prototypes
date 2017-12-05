package com.dragonhunters.infrastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.dragonhunters.model.card.action.ActionTypeEnum;
import com.dragonhunters.model.card.equipment.EquipmentCard;
import com.dragonhunters.model.card.equipment.EquipmentTypeEnum;

@Component
public class EquipmentRepository implements Repository<EquipmentCard, Boolean> {

	private List<EquipmentCard> elements;
	
	public EquipmentRepository() {
		super();
		this.elements = new ArrayList<>();
		this.elements.add(new EquipmentCard(1, "Short Sword", 1, EquipmentTypeEnum.WEAPON_ONE_HAND, ActionTypeEnum.CUTTING_PIERCING, null, true));
		this.elements.add(new EquipmentCard(2, "Hammer", 1, EquipmentTypeEnum.WEAPON_ONE_HAND, ActionTypeEnum.CONTUSIVE, null, true));
		this.elements.add(new EquipmentCard(3, "Wooden Shield", 1, EquipmentTypeEnum.SHIELD, ActionTypeEnum.DEFENSE, null, true));
		this.elements.add(new EquipmentCard(4, "Leather Jacket", 1, EquipmentTypeEnum.ARMOR, ActionTypeEnum.DEFENSE, null, true));
		this.elements.add(new EquipmentCard(5, "Spear", 2, EquipmentTypeEnum.WEAPON_TWO_HANDS, ActionTypeEnum.CUTTING_PIERCING, null, true));
		this.elements.add(new EquipmentCard(6, "Short Bow", 1, EquipmentTypeEnum.WEAPON_TWO_HANDS, ActionTypeEnum.RANGE, null, true));
		this.elements.add(new EquipmentCard(7, "Ivory Dagger", 1, EquipmentTypeEnum.WEAPON_ONE_HAND, ActionTypeEnum.CUTTING_PIERCING, null, false));
		this.elements.add(new EquipmentCard(8, "Wooden Shield", 1, EquipmentTypeEnum.SHIELD, ActionTypeEnum.DEFENSE, null, false));
		this.elements.add(new EquipmentCard(9, "Broadsword", 2, EquipmentTypeEnum.WEAPON_ONE_HAND, ActionTypeEnum.CUTTING_PIERCING, null, false));
		this.elements.add(new EquipmentCard(10, "Smoke Bomb", 1, EquipmentTypeEnum.BOMB, ActionTypeEnum.RANGE, null, false));
		this.elements.add(new EquipmentCard(11, "Granade", 2, EquipmentTypeEnum.BOMB, ActionTypeEnum.RANGE, null, false));
		this.elements.add(new EquipmentCard(12, "Healing Potion", 0, EquipmentTypeEnum.POTION, ActionTypeEnum.NEUTRAL, null, false));
		this.elements.add(new EquipmentCard(13, "Potion of Courage", 0, EquipmentTypeEnum.POTION, ActionTypeEnum.NEUTRAL, null, false));
		this.elements.add(new EquipmentCard(14, "Long Bow", 2, EquipmentTypeEnum.WEAPON_TWO_HANDS, ActionTypeEnum.RANGE, null, false));
		this.elements.add(new EquipmentCard(15, "Great Axe", 3, EquipmentTypeEnum.WEAPON_TWO_HANDS, ActionTypeEnum.CUTTING_PIERCING, null, false));
		this.elements.add(new EquipmentCard(16, "Dragonscale Shield", 3, EquipmentTypeEnum.SHIELD, ActionTypeEnum.DEFENSE, null, false));
		this.elements.add(new EquipmentCard(17, "Carapace Armor", 3, EquipmentTypeEnum.ARMOR, ActionTypeEnum.DEFENSE, null, false));
	}

	@Override
	public List<EquipmentCard> findAll() {
		return this.elements;
	}

	@Override
	public List<EquipmentCard> findBySelector(Boolean selector) {
		return this.elements.stream()
				.filter(a -> a.isInitialEquipment() == selector)
				.collect(Collectors.toList());
	}

	@Override
	public EquipmentCard findById(int id) {
		return this.elements.stream()
				.filter(a -> a.getId() == id)
				.findFirst()
				.orElse(null);
	}

}
