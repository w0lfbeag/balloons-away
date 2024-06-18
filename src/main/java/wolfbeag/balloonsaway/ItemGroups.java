package wolfbeag.balloonsaway;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import static wolfbeag.balloonsaway.items.Moditems.*;

public class ItemGroups {

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(CAMEL_BALLOON))
            .displayName(Text.translatable("itemGroup.balloonsaway.balloons_away"))
            .entries((context, entries) -> {
                entries.add(WHITE_BALLOON);
                entries.add(VILLAGER_BALLOON);
                entries.add(CAMEL_BALLOON);
                entries.add(SNIFFER_BALLOON);
                entries.add(WOLF_BALLOON);
            })
            .build();


}
