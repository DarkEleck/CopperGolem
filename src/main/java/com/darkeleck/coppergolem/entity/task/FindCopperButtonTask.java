package com.darkeleck.coppergolem.entity.task;

import com.darkeleck.coppergolem.entity.CopperGolemEntity;
import net.minecraft.entity.ai.brain.task.Task;

import java.util.Map;

public class FindCopperButtonTask extends Task<CopperGolemEntity> {
    public FindCopperButtonTask(Map requiredMemoryState) {
        super(requiredMemoryState);
    }
}
