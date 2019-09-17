package com.leekwars.generator.attack.effect;

import com.leekwars.generator.fight.Fight;
import com.leekwars.generator.fight.entity.Entity;

public class EffectBuffMP extends Effect {

	@Override
	public void apply(Fight fight) {

		value = (int) Math.round((value1 + value2 * jet) * (1 + (double) caster.getScience() / 100) * power * criticalPower);

		stats.setStat(Entity.CHARAC_MP, value);
		target.updateBuffStats(Entity.CHARAC_MP);
	}

	public void reduce() {
		value /= 2;
		stats.setStat(Entity.CHARAC_MP, value);
		target.updateBuffStats(Entity.CHARAC_MP);
	}
}