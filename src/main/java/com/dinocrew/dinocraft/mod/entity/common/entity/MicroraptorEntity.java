package com.dinocrew.dinocraft.mod.entity.common.entity;

import com.dinocrew.dinocraft.mod.entity.ModEntityTypes;
import com.dinocrew.dinocraft.mod.registry.RegisterBlocks;
import com.mojang.brigadier.builder.ArgumentBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.util.AirRandomPos;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.EnumSet;
import java.util.Random;

public class MicroraptorEntity  extends FlyingMob {
    public MicroraptorEntity(EntityType<MicroraptorEntity> entityType, Level level) {
        super(entityType, level);
        this.moveControl = new MicroraptorEntity.MicroraptorMoveControl(this);
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.MOVEMENT_SPEED, 0.25D);}

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new MicroraptorEntity.RandomFloatAroundGoal(this));
    }

//
//    public void tick() {
//        if (this.getTarget() == null) {
//            Vec3 vec3 = this.getDeltaMovement();
//            this.setYRot(-((float) Mth.atan2(vec3.x, vec3.z)) * (180F / (float) Math.PI));
//            this.yBodyRot = this.getYRot();
//        } else {
//            LivingEntity livingentity = this.getTarget();
//            double d0 = 64.0D;
//            if (livingentity.distanceToSqr(this) < 4096.0D) {
//                double d1 = livingentity.getX() - this.getX();
//                double d2 = livingentity.getZ() - this.getZ();
//                this.setYRot(-((float) Mth.atan2(d1, d2)) * (180F / (float) Math.PI));
//                this.yBodyRot = this.getYRot();
//            }
//        }
//
//    }


    static class RandomFloatAroundGoal extends Goal {
        private final MicroraptorEntity microraptor;

        public RandomFloatAroundGoal(MicroraptorEntity p_32783_) {
            this.microraptor = p_32783_;
            this.setFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        public boolean canUse() {
            MoveControl movecontrol = this.microraptor.getMoveControl();
            if (!movecontrol.hasWanted()) {
                return true;
            } else {
                double d0 = movecontrol.getWantedX() - this.microraptor.getX();
                double d1 = movecontrol.getWantedY() - this.microraptor.getY();
                double d2 = movecontrol.getWantedZ() - this.microraptor.getZ();
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                return d3 < 1.0D || d3 > 3600.0D;
            }
        }

        public boolean canContinueToUse() {
            return false;
        }

        public void start() {
            Random random = this.microraptor.getRandom();
            double d0 = this.microraptor.getX() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
            double d1 = this.microraptor.getY() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
            double d2 = this.microraptor.getZ() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
            this.microraptor.getMoveControl().setWantedPosition(d0, d1, d2, 1.0D);
        }
    }


    static class MicroraptorMoveControl extends MoveControl {
        private final MicroraptorEntity microraptor;
        private int floatDuration;

        public MicroraptorMoveControl(MicroraptorEntity p_32768_) {
            super(p_32768_);
            this.microraptor = p_32768_;
        }

        public void tick() {
            if (this.operation == MoveControl.Operation.MOVE_TO) {
                if (this.floatDuration-- <= 0) {
                    this.floatDuration += this.microraptor.getRandom().nextInt(5) + 2;
                    Vec3 vec3 = new Vec3(this.wantedX - this.microraptor.getX(), this.wantedY - this.microraptor.getY(), this.wantedZ - this.microraptor.getZ());
                    double d0 = vec3.length();
                    vec3 = vec3.normalize();
                    if (this.canReach(vec3, Mth.ceil(d0))) {
                        this.microraptor.setDeltaMovement(this.microraptor.getDeltaMovement().add(vec3.scale(0.1D)));
                    } else {
                        this.operation = MoveControl.Operation.WAIT;
                    }

                }


            }


        }

        private boolean canReach(Vec3 p_32771_, int p_32772_) {
            AABB aabb = this.microraptor.getBoundingBox();

            for (int i = 1; i < p_32772_; ++i) {
                aabb = aabb.move(p_32771_);
                if (!this.microraptor.level.noCollision(this.microraptor, aabb)) {
                    return false;
                }
            }

            return true;
        }
    }}









