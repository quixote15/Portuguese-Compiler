/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import java.util.*;
import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ASeComandos extends PComandos
{
    private PExpressaoLogica _expressaoLogica_;
    private final LinkedList<PComandos> _comandos_ = new LinkedList<PComandos>();

    public ASeComandos()
    {
        // Constructor
    }

    public ASeComandos(
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_,
        @SuppressWarnings("hiding") List<?> _comandos_)
    {
        // Constructor
        setExpressaoLogica(_expressaoLogica_);

        setComandos(_comandos_);

    }

    @Override
    public Object clone()
    {
        return new ASeComandos(
            cloneNode(this._expressaoLogica_),
            cloneList(this._comandos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeComandos(this);
    }

    public PExpressaoLogica getExpressaoLogica()
    {
        return this._expressaoLogica_;
    }

    public void setExpressaoLogica(PExpressaoLogica node)
    {
        if(this._expressaoLogica_ != null)
        {
            this._expressaoLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoLogica_ = node;
    }

    public LinkedList<PComandos> getComandos()
    {
        return this._comandos_;
    }

    public void setComandos(List<?> list)
    {
        for(PComandos e : this._comandos_)
        {
            e.parent(null);
        }
        this._comandos_.clear();

        for(Object obj_e : list)
        {
            PComandos e = (PComandos) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comandos_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressaoLogica_)
            + toString(this._comandos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressaoLogica_ == child)
        {
            this._expressaoLogica_ = null;
            return;
        }

        if(this._comandos_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressaoLogica_ == oldChild)
        {
            setExpressaoLogica((PExpressaoLogica) newChild);
            return;
        }

        for(ListIterator<PComandos> i = this._comandos_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComandos) newChild);
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
