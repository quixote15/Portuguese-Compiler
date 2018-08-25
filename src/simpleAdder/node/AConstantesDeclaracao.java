/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AConstantesDeclaracao extends PDeclaracao
{
    private TConstante _constante_;
    private PDeclaracao _declaracao_;
    private PValor _valor_;

    public AConstantesDeclaracao()
    {
        // Constructor
    }

    public AConstantesDeclaracao(
        @SuppressWarnings("hiding") TConstante _constante_,
        @SuppressWarnings("hiding") PDeclaracao _declaracao_,
        @SuppressWarnings("hiding") PValor _valor_)
    {
        // Constructor
        setConstante(_constante_);

        setDeclaracao(_declaracao_);

        setValor(_valor_);

    }

    @Override
    public Object clone()
    {
        return new AConstantesDeclaracao(
            cloneNode(this._constante_),
            cloneNode(this._declaracao_),
            cloneNode(this._valor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstantesDeclaracao(this);
    }

    public TConstante getConstante()
    {
        return this._constante_;
    }

    public void setConstante(TConstante node)
    {
        if(this._constante_ != null)
        {
            this._constante_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._constante_ = node;
    }

    public PDeclaracao getDeclaracao()
    {
        return this._declaracao_;
    }

    public void setDeclaracao(PDeclaracao node)
    {
        if(this._declaracao_ != null)
        {
            this._declaracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declaracao_ = node;
    }

    public PValor getValor()
    {
        return this._valor_;
    }

    public void setValor(PValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._constante_)
            + toString(this._declaracao_)
            + toString(this._valor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._constante_ == child)
        {
            this._constante_ = null;
            return;
        }

        if(this._declaracao_ == child)
        {
            this._declaracao_ = null;
            return;
        }

        if(this._valor_ == child)
        {
            this._valor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._constante_ == oldChild)
        {
            setConstante((TConstante) newChild);
            return;
        }

        if(this._declaracao_ == oldChild)
        {
            setDeclaracao((PDeclaracao) newChild);
            return;
        }

        if(this._valor_ == oldChild)
        {
            setValor((PValor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
