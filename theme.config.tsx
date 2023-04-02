import React from 'react'
import { DocsThemeConfig } from 'nextra-theme-docs'

export const DEFAULT_LOCALE = 'pt-BR'

const config: DocsThemeConfig = {
  docsRepositoryBase: 'https://google.com.br',
  logo: (<><span style={{ color: '#3cb66e' }} >FIAP</span></>),
  project: {
    link: 'https://github.com/FIAP/cursos',
  },
  search: {
    emptyResult: (<span className="nx-block nx-select-none nx-p-8 nx-text-center nx-text-sm nx-text-gray-400">
      Nenhum resultado encontrado.
    </span>),
    loading: 'Carregando...',
    placeholder: 'Pesquisar documentação…'
  },
  toc: {
    title: 'Nesta página'
  },
  feedback: {
    content: 'Pergunta? Dê-nos um feedback →',
    labels: 'feedback'
  },
  editLink: {
    text: 'Edite essa página'
  },
  footer: {
    text: `MIT ${new Date().getFullYear()} © FIAP`
  },
  gitTimestamp: function useGitTimestamp({ timestamp }) {
    return (
      <>
        Última atualização em{' '}
        <time dateTime={timestamp.toISOString()}>
          {timestamp.toLocaleDateString(DEFAULT_LOCALE, {
            day: '2-digit',
            month: 'long',
            year: 'numeric'
          })}
        </time>
      </>
    )
  },
  useNextSeoProps: () => ({
    titleTemplate: '%s'
  })
}

export default config
