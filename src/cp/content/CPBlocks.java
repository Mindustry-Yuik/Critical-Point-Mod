package cp.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.pattern.ShootSpread;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;

import static mindustry.type.ItemStack.with;

public class CPBlocks {
    public static Block
    converge;
    public static void load(){

        converge = new ItemTurret("converge"){{
            health = 960;
            range = 200;
            smokeEffect = Fx.shootBigSmoke;

            coolant = consumeCoolant(0.1F);

            shoot = new ShootSpread(){{
                shots = 12;
                shotDelay = 2f;
                spread = 0.55f;
            }};

            reload = 90f;
            recoil = 3f;
            shootCone = 30f;
            inaccuracy = 4f;
            size = 2;
            shootSound = Sounds.shootSnap;//Sounds.shootSnap
            shake = 3f;
            ammo(
                    Items.titanium, new BasicBulletType(5, 24){{
                        width = 8f;
                        height = 25f;
                        hitColor = backColor = lightColor = trailColor = Items.titanium.color.cpy().lerp(Color.white, 0.1f);
                        frontColor = backColor.cpy().lerp(Color.white, 0.35f);
                        ammoMultiplier = 8;
                        pierceArmor = true;
                    }}


            );

            limitRange();
            maxAmmo = 120;
            ammoPerShot = 1;

            requirements(Category.turret, with(Items.copper, 30, Items.graphite, 40, cpItems.darkMatter, 10, Items.lead, 60));
        }};

    }
}
