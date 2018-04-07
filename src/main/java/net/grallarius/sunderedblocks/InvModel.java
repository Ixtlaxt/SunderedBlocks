package net.grallarius.sunderedblocks;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import java.util.ArrayList;

public class InvModel {

    private static final ArrayList<InvModel> models = new ArrayList<>();

    public static void add(Item item, int meta, String name, String variant) {
        System.out.println("model " + name + " is being registered");
        models.add(new InvModel(item, meta, name, variant));
    }

    public static void add(Item item, String name) {
        System.out.println("model " + name + " is being registered");
        add(item, 0, name, "inventory");
    }

    private final Item item;
    private final int meta;
    private final String name;
    private final String variant;

    public InvModel(Item item, int meta, String name, String variant) {
        System.out.println("InvModel: " + name + " - " + variant);
        this.item = item;
        this.meta = meta;
        this.name = name;
        this.variant = variant;
    }



    public static void register() {

        System.out.println("model registry is called");

        for(InvModel invmodel : models){
            System.out.println("Registering model: " + invmodel.meta + "-"+ invmodel.item.getRegistryName() + "-" + invmodel.item.getUnlocalizedName() + "-" + invmodel.variant);
//            if(invmodel.item.getHasSubtypes()) {
                ModelLoader.setCustomModelResourceLocation(invmodel.item, invmodel.meta,
                        new ModelResourceLocation(invmodel.item.getRegistryName(), invmodel.variant));
//            }
//            ModelLoader.setCustomModelResourceLocation(invmodel.item, invmodel.meta,
//                    new ModelResourceLocation(invmodel.item.getRegistryName(), invmodel.variant));
        }
    }
}
