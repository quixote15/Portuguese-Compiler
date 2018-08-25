/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import java.util.*;
import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoComando extends PComando
{
    private PExpLogica _expLogica_;
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public AEnquantoComando()
    {
        // Constructor
    }

    public AEnquantoComando(
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setExpLogica(_expLogica_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoComando(
            cloneNode(this._expLogica_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoComando(this);
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogica_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
