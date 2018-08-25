/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.parser;

import simpleAdder.node.*;
import simpleAdder.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTNumInt(@SuppressWarnings("unused") TNumInt node)
    {
        this.index = 0;
    }

    @Override
    public void caseTNumReal(@SuppressWarnings("unused") TNumReal node)
    {
        this.index = 1;
    }

    @Override
    public void caseTBool(@SuppressWarnings("unused") TBool node)
    {
        this.index = 2;
    }

    @Override
    public void caseTChar(@SuppressWarnings("unused") TChar node)
    {
        this.index = 3;
    }

    @Override
    public void caseTStringLiteral(@SuppressWarnings("unused") TStringLiteral node)
    {
        this.index = 4;
    }

    @Override
    public void caseTReal(@SuppressWarnings("unused") TReal node)
    {
        this.index = 5;
    }

    @Override
    public void caseTInteiro(@SuppressWarnings("unused") TInteiro node)
    {
        this.index = 6;
    }

    @Override
    public void caseTBooleano(@SuppressWarnings("unused") TBooleano node)
    {
        this.index = 7;
    }

    @Override
    public void caseTCaractere(@SuppressWarnings("unused") TCaractere node)
    {
        this.index = 8;
    }

    @Override
    public void caseTConstante(@SuppressWarnings("unused") TConstante node)
    {
        this.index = 9;
    }

    @Override
    public void caseTInicio(@SuppressWarnings("unused") TInicio node)
    {
        this.index = 10;
    }

    @Override
    public void caseTFimprograma(@SuppressWarnings("unused") TFimprograma node)
    {
        this.index = 11;
    }

    @Override
    public void caseTPrograma(@SuppressWarnings("unused") TPrograma node)
    {
        this.index = 12;
    }

    @Override
    public void caseTEscreva(@SuppressWarnings("unused") TEscreva node)
    {
        this.index = 13;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 14;
    }

    @Override
    public void caseTFaca(@SuppressWarnings("unused") TFaca node)
    {
        this.index = 15;
    }

    @Override
    public void caseTEntao(@SuppressWarnings("unused") TEntao node)
    {
        this.index = 16;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 17;
    }

    @Override
    public void caseTFimse(@SuppressWarnings("unused") TFimse node)
    {
        this.index = 18;
    }

    @Override
    public void caseTEnquanto(@SuppressWarnings("unused") TEnquanto node)
    {
        this.index = 19;
    }

    @Override
    public void caseTFimenquanto(@SuppressWarnings("unused") TFimenquanto node)
    {
        this.index = 20;
    }

    @Override
    public void caseTPara(@SuppressWarnings("unused") TPara node)
    {
        this.index = 21;
    }

    @Override
    public void caseTFimpara(@SuppressWarnings("unused") TFimpara node)
    {
        this.index = 22;
    }

    @Override
    public void caseTPasso(@SuppressWarnings("unused") TPasso node)
    {
        this.index = 23;
    }

    @Override
    public void caseTAvalie(@SuppressWarnings("unused") TAvalie node)
    {
        this.index = 24;
    }

    @Override
    public void caseTFimavalie(@SuppressWarnings("unused") TFimavalie node)
    {
        this.index = 25;
    }

    @Override
    public void caseTCaso(@SuppressWarnings("unused") TCaso node)
    {
        this.index = 26;
    }

    @Override
    public void caseTAColchete(@SuppressWarnings("unused") TAColchete node)
    {
        this.index = 27;
    }

    @Override
    public void caseTFColchete(@SuppressWarnings("unused") TFColchete node)
    {
        this.index = 28;
    }

    @Override
    public void caseTAParentese(@SuppressWarnings("unused") TAParentese node)
    {
        this.index = 29;
    }

    @Override
    public void caseTFParentese(@SuppressWarnings("unused") TFParentese node)
    {
        this.index = 30;
    }

    @Override
    public void caseTLeia(@SuppressWarnings("unused") TLeia node)
    {
        this.index = 31;
    }

    @Override
    public void caseTRepita(@SuppressWarnings("unused") TRepita node)
    {
        this.index = 32;
    }

    @Override
    public void caseTAte(@SuppressWarnings("unused") TAte node)
    {
        this.index = 33;
    }

    @Override
    public void caseTDe(@SuppressWarnings("unused") TDe node)
    {
        this.index = 34;
    }

    @Override
    public void caseTNao(@SuppressWarnings("unused") TNao node)
    {
        this.index = 35;
    }

    @Override
    public void caseTE(@SuppressWarnings("unused") TE node)
    {
        this.index = 36;
    }

    @Override
    public void caseTOu(@SuppressWarnings("unused") TOu node)
    {
        this.index = 37;
    }

    @Override
    public void caseTXor(@SuppressWarnings("unused") TXor node)
    {
        this.index = 38;
    }

    @Override
    public void caseTAtrib(@SuppressWarnings("unused") TAtrib node)
    {
        this.index = 39;
    }

    @Override
    public void caseTPontoevirg(@SuppressWarnings("unused") TPontoevirg node)
    {
        this.index = 40;
    }

    @Override
    public void caseTVirg(@SuppressWarnings("unused") TVirg node)
    {
        this.index = 41;
    }

    @Override
    public void caseTDoispontos(@SuppressWarnings("unused") TDoispontos node)
    {
        this.index = 42;
    }

    @Override
    public void caseTMais(@SuppressWarnings("unused") TMais node)
    {
        this.index = 43;
    }

    @Override
    public void caseTMenos(@SuppressWarnings("unused") TMenos node)
    {
        this.index = 44;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 45;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 46;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 47;
    }

    @Override
    public void caseTMaiorq(@SuppressWarnings("unused") TMaiorq node)
    {
        this.index = 48;
    }

    @Override
    public void caseTMenorq(@SuppressWarnings("unused") TMenorq node)
    {
        this.index = 49;
    }

    @Override
    public void caseTMaiori(@SuppressWarnings("unused") TMaiori node)
    {
        this.index = 50;
    }

    @Override
    public void caseTMenori(@SuppressWarnings("unused") TMenori node)
    {
        this.index = 51;
    }

    @Override
    public void caseTIgual(@SuppressWarnings("unused") TIgual node)
    {
        this.index = 52;
    }

    @Override
    public void caseTDiferente(@SuppressWarnings("unused") TDiferente node)
    {
        this.index = 53;
    }

    @Override
    public void caseTNovalinha(@SuppressWarnings("unused") TNovalinha node)
    {
        this.index = 54;
    }

    @Override
    public void caseTComentarioBloco(@SuppressWarnings("unused") TComentarioBloco node)
    {
        this.index = 55;
    }

    @Override
    public void caseTComentarioBlocFimErrado(@SuppressWarnings("unused") TComentarioBlocFimErrado node)
    {
        this.index = 56;
    }

    @Override
    public void caseTComentarioCorpo(@SuppressWarnings("unused") TComentarioCorpo node)
    {
        this.index = 57;
    }

    @Override
    public void caseTEstrela(@SuppressWarnings("unused") TEstrela node)
    {
        this.index = 58;
    }

    @Override
    public void caseTBarra(@SuppressWarnings("unused") TBarra node)
    {
        this.index = 59;
    }

    @Override
    public void caseTComentLin(@SuppressWarnings("unused") TComentLin node)
    {
        this.index = 60;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 61;
    }

    @Override
    public void caseTIdentificador(@SuppressWarnings("unused") TIdentificador node)
    {
        this.index = 62;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 63;
    }
}
