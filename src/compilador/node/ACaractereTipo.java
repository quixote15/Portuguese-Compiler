/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ACaractereTipo extends PTipo
{
    private TCaractere _caractere_;

    public ACaractereTipo()
    {
        // Constructor
    }

    public ACaractereTipo(
        @SuppressWarnings("hiding") TCaractere _caractere_)
    {
        // Constructor
        setCaractere(_caractere_);

    }

    @Override
    public Object clone()
    {
        return new ACaractereTipo(
            cloneNode(this._caractere_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACaractereTipo(this);
    }

    public TCaractere getCaractere()
    {
        return this._caractere_;
    }

    public void setCaractere(TCaractere node)
    {
        if(this._caractere_ != null)
        {
            this._caractere_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caractere_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._caractere_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._caractere_ == child)
        {
            this._caractere_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._caractere_ == oldChild)
        {
            setCaractere((TCaractere) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
