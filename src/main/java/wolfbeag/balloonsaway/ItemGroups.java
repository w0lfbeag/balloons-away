package wolfbeag.balloonsaway;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import static wolfbeag.balloonsaway.Moditems.WHITE_WATER_BALLOON;

public class ItemGroups {

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(WHITE_WATER_BALLOON))
            .displayName(Text.translatable("itemGroup.balloonsaway.balloons_away"))
            .entries((context, entries) -> {
                entries.add(WHITE_WATER_BALLOON);
            })
            .build();


}
