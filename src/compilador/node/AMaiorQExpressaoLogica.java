/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorQExpressaoLogica extends PExpressaoLogica
{
    private PExpressaoAritmetica _esquerda_;
    private PExpressaoAritmetica _direita_;

    public AMaiorQExpressaoLogica()
    {
        // Constructor
    }

    public AMaiorQExpressaoLogica(
        @SuppressWarnings("hiding") PExpressaoAritmetica _esquerda_,
        @SuppressWarnings("hiding") PExpressaoAritmetica _direita_)
    {
        // Constructor
        setEsquerda(_esquerda_);

        setDireita(_direita_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorQExpressaoLogica(
            cloneNode(this._esquerda_),
            cloneNode(this._direita_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorQExpressaoLogica(this);
    }

    public PExpressaoAritmetica getEsquerda()
    {
        return this._esquerda_;
    }

    public void setEsquerda(PExpressaoAritmetica node)
    {
        if(this._esquerda_ != null)
        {
            this._esquerda_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esquerda_ = node;
    }

    public PExpressaoAritmetica getDireita()
    {
        return this._direita_;
    }

    public void setDireita(PExpressaoAritmetica node)
    {
        if(this._direita_ != null)
        {
            this._direita_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._direita_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._esquerda_)
            + toString(this._direita_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._esquerda_ == child)
        {
            this._esquerda_ = null;
            return;
        }

        if(this._direita_ == child)
        {
            this._direita_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._esquerda_ == oldChild)
        {
            setEsquerda((PExpressaoAritmetica) newChild);
            return;
        }

        if(this._direita_ == oldChild)
        {
            setDireita((PExpressaoAritmetica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
