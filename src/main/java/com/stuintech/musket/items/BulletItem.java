package com.stuintech.musket.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BulletItem extends ArrowItem {

    public BulletItem(Settings settings) {
        super(settings);
    }

    public ProjectileEntity createProjectile(World world_1, ItemStack itemStack_1, LivingEntity livingEntity_1) {
        ArrowEntity arrowEntity_1 = new ArrowEntity(world_1, livingEntity_1);
        return arrowEntity_1;
    }
}
