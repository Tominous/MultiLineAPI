package net.iso2013.mlapi.structure.transactions;

import net.iso2013.mlapi.tag.RenderedTagLine;
import net.iso2013.peapi.api.entity.EntityIdentifier;

import java.util.Collection;

/**
 * Created by iso2013 on 6/13/2018.
 */
public class RemoveTransaction extends StructureTransaction {

    private final EntityIdentifier below;
    private final EntityIdentifier above;
    private final Collection<RenderedTagLine> removed;

    public RemoveTransaction(EntityIdentifier below, EntityIdentifier above, Collection<RenderedTagLine> removed) {
        this.below = below;
        this.above = above;
        this.removed = removed;
    }

    public EntityIdentifier getBelow() {
        return below;
    }

    public EntityIdentifier getAbove() {
        return above;
    }

    public Collection<RenderedTagLine> getRemoved() {
        return removed;
    }
}
