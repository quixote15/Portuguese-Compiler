/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import java.util.*;
import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AParaComando extends PComando
{
    private PVar _var_;
    private TNumInt _l_;
    private TNumInt _r_;
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public AParaComando()
    {
        // Constructor
    }

    public AParaComando(
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TNumInt _l_,
        @SuppressWarnings("hiding") TNumInt _r_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setVar(_var_);

        setL(_l_);

        setR(_r_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AParaComando(
            cloneNode(this._var_),
            cloneNode(this._l_),
            cloneNode(this._r_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaComando(this);
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public TNumInt getL()
    {
        return this._l_;
    }

    public void setL(TNumInt node)
    {
        if(this._l_ != null)
        {
            this._l_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._l_ = node;
    }

    public TNumInt getR()
    {
        return this._r_;
    }

    public void setR(TNumInt node)
    {
        if(this._r_ != null)
        {
            this._r_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._r_ = node;
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
            + toString(this._var_)
            + toString(this._l_)
            + toString(this._r_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._l_ == child)
        {
            this._l_ = null;
            return;
        }

        if(this._r_ == child)
        {
            this._r_ = null;
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
        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._l_ == oldChild)
        {
            setL((TNumInt) newChild);
            return;
        }

        if(this._r_ == oldChild)
        {
            setR((TNumInt) newChild);
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
